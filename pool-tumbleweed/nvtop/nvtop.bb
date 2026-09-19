SUMMARY = "A (h)top like task monitor for NVIDIA and AMD GPUs"
DESCRIPTION = "Nvtop stands for NVidia TOP, a (h)top like task monitor for AMD, NVIDIA and \
now Intel GPUs. \
 \
It can handle multiple GPUs and print information about them in a htop familiar \
way."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.2"

RPM_NAME = "nvtop-3.3.2-1.4.aarch64.rpm"
RPM_HASH = "e60787265ff88c4fc09146797a23f390e42fd0412b7d9f0c38e7d9d20b5e4606ef482594b5ff4dfbfe12baf9b83367323e006ff817f8ed3b86b734110fd9a557"

RPROVIDES:${PN} += "nvtop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libsystemd.so.0 \
libtinfo.so.6"

inherit rpm
