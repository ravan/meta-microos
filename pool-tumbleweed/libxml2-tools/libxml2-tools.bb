SUMMARY = "Tools using libxml"
DESCRIPTION = "This package contains xmllint, a very useful tool proving libxml's power."
LICENSE = "MIT"

PV = "2.15.4"

RPM_NAME = "libxml2-tools-2.15.4-1.1.aarch64.rpm"
RPM_HASH = "92a02faf02b7759b55eda6c68829d4801ae8873859e8b8109197d81492bae594c978645c00ad58e3d72abc36e78d17d9f3514e6bc43c67a18e38077999b51208"

RPROVIDES:${PN} += "libxml2 \
libxml2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhistory.so.8 \
libreadline.so.8 \
libxml2.so.16"

inherit rpm
