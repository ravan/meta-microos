SUMMARY = "Free and Open Scalable Electronic Font"
DESCRIPTION = "The efont-serif is a really free and open scalable electronic font. \
 \
The Omega Serif and URW Nimbus are also distributable. But their letter \
forms are quite similar to Adobe Times. The efont-serif does not copy \
the outlines or the letter forms of any copyrighted typefaces."
LICENSE = "GPL-2.0"

PV = "20010312"

RPM_NAME = "efont-serif-fonts-20010312-678.25.noarch.rpm"
RPM_HASH = "c94f5235cbeb5dcfe57d96738395b7942ca2b25356b4c509142473d6e1c97601cc3bc9814f9125fc5d6ff3843af972e1ec97b208da6f4ec8a5d9fe261500ed41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-efont-serif-fonts \
efont-serif-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
