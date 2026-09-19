# openSUSE's name for what Yocto calls linux-libc-headers. Claim both names so
# recipes depending on either one resolve to the signed RPM.
PROVIDES:append:microos-sysroot = " virtual/linux-libc-headers linux-libc-headers"
