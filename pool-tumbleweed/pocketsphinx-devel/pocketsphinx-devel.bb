SUMMARY = "Development files for pocketsphinx, a speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit has a number of packages for different tasks and \
applications. Pocketsphinx is a version of the open-source CMU Sphinx \
II speech recognition system which is able to recognize speech in \
real-time. \
 \
This is the development package for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "5.0.3+git20241211.69167fb"

RPM_NAME = "pocketsphinx-devel-5.0.3+git20241211.69167fb-1.7.aarch64.rpm"
RPM_HASH = "32ab188158d46dfce94e53d574508f6aa44f42597454ae88a228699fbb3dd68f5bbef440add405ffcfdc7d5f8b1846918fef79ecfcf94075641126b7ebb1ffa0"

RPROVIDES:${PN} += "pkgconfig-pocketsphinx \
pocketsphinx-devel \
pocketsphinx5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pocketsphinx"

inherit rpm
