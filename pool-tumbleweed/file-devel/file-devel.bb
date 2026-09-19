SUMMARY = "Development files for libmagic, a library to determine file types"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require the magic 'file' interface."
LICENSE = "BSD-2-Clause"

PV = "5.48"

RPM_NAME = "file-devel-5.48-2.2.aarch64.rpm"
RPM_HASH = "69f51777cf60bbac101d77eda15fef5ffd36b4daaa64c32f8ebb1273bcc9835c7e1b8cb66edd88f2c84eb941707ca6ac3326494dc56515153348078661cd56a8"

RPROVIDES:${PN} += "file-/usr/include/magic.h \
file-devel \
pkgconfig-libmagic"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmagic1"

inherit rpm
