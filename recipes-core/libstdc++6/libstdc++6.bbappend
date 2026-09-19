# The C++ runtime. Yocto would normally build this as gcc-runtime; in the
# microos-sysroot mode it is openSUSE's signed libstdc++6 RPM, which is built by
# a newer gcc than ours. That is the safe direction: libstdc++ is backwards
# compatible, so code from our older gcc runs against it.
PROVIDES:append:microos-sysroot = " virtual/${TARGET_PREFIX}compilerlibs gcc-runtime"
