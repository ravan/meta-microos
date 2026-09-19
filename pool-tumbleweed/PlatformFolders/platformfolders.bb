SUMMARY = "Library for cross-platform detection of special directories"
DESCRIPTION = "C++ library to look for directories like My Documents, \
~/.config, etc. so that you do not need to write \
platform-specific code."
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "PlatformFolders-4.3.0-1.4.aarch64.rpm"
RPM_HASH = "3a705c3a59d040c33dba5b00e72532bc018f0faca5cd3cbbce7c8ae099279deec1493a5e84e844763e173249ce254d793b28f019cee92073c8974d1dd17992f1"

RPROVIDES:${PN} += "PlatformFolders \
libplatform-folders.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
