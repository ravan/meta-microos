SUMMARY = "Development files for the Lexical Toolbox"
DESCRIPTION = "lttoolbox is a toolbox for lexical processing, morphological analysis \
and generation of words. Analysis is the process of splitting a word \
(e.g. cats) into its lemma 'cat' and the grammatical information \
<neutrum,plural>. Generation is the opposite process. \
 \
This subpackage contains the development files for lttoolbox."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.3"

RPM_NAME = "lttoolbox-devel-3.8.3-1.3.aarch64.rpm"
RPM_HASH = "65a5a88b305de183db72686060f702a1a4023123659d3cd8e941c723a61899df6fd254bb465cb07ff4e170e0f70422e5831bbbc5e5db05699b1ee6fda2f8a0e2"

RPROVIDES:${PN} += "lttoolbox-devel \
pkgconfig-lttoolbox"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblttoolbox3"

inherit rpm
