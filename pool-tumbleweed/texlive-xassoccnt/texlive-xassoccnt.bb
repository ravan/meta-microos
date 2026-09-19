SUMMARY = "Associated counters stepping simultaneously"
DESCRIPTION = "This package provides a way of associating counters to an \
existing driver counter so that incrementing the driver counter \
will increase its associated counters as well. This package can \
be regarded as a supplement to the totcount package by \
Vasileios Koutavas, but it can be used without it, too. \
xassoccnt is a successor and a complete rewrite of the assoccnt \
package by the same author. However, as of 2017-03-05, some \
features of assoccnt are not (yet) contained in xassoccnt so \
that the older package cannot yet be regarded as obsolete."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn61112"

RPM_NAME = "texlive-xassoccnt-2026.226.2.0svn61112-59.4.noarch.rpm"
RPM_HASH = "fd648a60215ee6dbe6bb636d6f821b328aee982d9711aeb817e37ec1f3862cecc20cb11491b1adf4b738ce2b6790c6cc1c289f95c04c25130544b5ad7c1cc4ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xassoccnt.sty \
texlive-xassoccnt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-l3keys2e.sty \
tex-letltxmacro.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
