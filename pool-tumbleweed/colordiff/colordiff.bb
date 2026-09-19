SUMMARY = "Colour-highlighted 'diff' output"
DESCRIPTION = "The Perl script colordiff is a wrapper for 'diff' and produces the same \
output but with pretty 'syntax' highlighting. Colour schemes can be \
customized."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.22"

RPM_NAME = "colordiff-1.0.22-1.1.noarch.rpm"
RPM_HASH = "e68846ef018aeac5245184734ff62eff9023c4655d85c5aa6533c0645aecf9fd45edd56f2bf4e36ad9c5aee03ce1fef2a7826f15ba4a295aab976efa054c336f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colordiff \
config-colordiff"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
