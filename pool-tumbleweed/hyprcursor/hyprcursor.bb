SUMMARY = "Library and utilities for the hyprland cursor format"
DESCRIPTION = "Utilities for the hyprland cursor format."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "hyprcursor-0.1.13-1.6.aarch64.rpm"
RPM_HASH = "4ae17064aec4d8751e3788c0d4b53388c6f7b72358cd59a77f2a7ed9fd06eb1b7e9c91f2c4914e807801b0af1eb0c106631e61aaa0ac5c7d51607bff8a7a786f"

RPROVIDES:${PN} += "hyprcursor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhyprcursor.so.0 \
libm.so.6 \
libstdc++.so.6 \
libzip.so.5"

inherit rpm
