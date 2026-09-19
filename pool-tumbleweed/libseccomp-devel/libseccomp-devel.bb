SUMMARY = "Development files for libseccomp, an enhanced Seccomp (mode 2) helper library"
DESCRIPTION = "The libseccomp library provides an interface to the Linux Kernel's \
syscall filtering mechanism, seccomp. The libseccomp API abstracts \
away the underlying BPF-based syscall filter language and presents a \
more conventional function-call based filtering interface. \
 \
This package contains the development files for libseccomp."
LICENSE = "LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "libseccomp-devel-2.6.1-3.1.aarch64.rpm"
RPM_HASH = "e71b267b056b1215190d3a3d31427b553f359f796b5a8a12413778e8367bc8bff864557bc39e5a5b07f8c7611475271f9c1fbf18debc08d20d119d1005f58978"

RPROVIDES:${PN} += "libseccomp-devel \
pkgconfig-libseccomp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libseccomp2"

inherit rpm
