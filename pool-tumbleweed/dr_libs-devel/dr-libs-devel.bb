SUMMARY = "Development files for dr_libs"
DESCRIPTION = "Development files for dr_libs."
LICENSE = "MIT-0 | Unlicense"

PV = "20260315"

RPM_NAME = "dr_libs-devel-20260315-1.2.noarch.rpm"
RPM_HASH = "294894389565c15570831c5e330bfd8f32288a5ac4511a6a30df3595daf95b19dbfd72e255eadee0f464f0c097d5af577b2c9a42225e86b53ae5c7e3d60faba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dr-flac \
dr-libs-devel \
dr-mp3 \
dr-wav"

RDEPENDS:${PN} += ""

inherit rpm
