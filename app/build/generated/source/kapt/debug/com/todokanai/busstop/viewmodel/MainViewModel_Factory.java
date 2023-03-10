// Generated by Dagger (https://dagger.dev).
package com.todokanai.busstop.viewmodel;

import com.todokanai.busstop.repository.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public MainViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static MainViewModel_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new MainViewModel_Factory(userRepositoryProvider);
  }

  public static MainViewModel newInstance(UserRepository userRepository) {
    return new MainViewModel(userRepository);
  }
}
