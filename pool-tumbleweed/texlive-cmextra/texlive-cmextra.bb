SUMMARY = "Knuth's local information"
DESCRIPTION = "A collection of experimental programs and developments based \
on, or complementary to, the matter in his distribution \
directories."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn57866"

RPM_NAME = "texlive-cmextra-2026.226.svn57866-60.2.noarch.rpm"
RPM_HASH = "afda25825c32c5b48d1d3ec2e6cfe63a527ff7f201f124de8fc5b40ada8341326f5e0972a1684e8a33f491e300aee25f65f75b3ce1c384d0fa273bdd7f1d934a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bible12.tfm \
tex-cmbxcd10.tfm \
tex-cmbxti12.tfm \
tex-cmbxti7.tfm \
tex-cmcscsl10.tfm \
tex-cmfibs8.tfm \
tex-cmitt12.tfm \
tex-cmitt9.tfm \
tex-cmman.tfm \
tex-cmntex10.tfm \
tex-cmntt10.tfm \
tex-cmsl6.tfm \
tex-cmsltt9.tfm \
tex-cmssbxo10.tfm \
tex-cmsslu30.tfm \
tex-cmssu30.tfm \
tex-cmsytt10.tfm \
tex-cmtim.tfm \
tex-cmvtti10.tfm \
tex-diam12.tfm \
tex-gen10.tfm \
tex-gen8.tfm \
tex-gen9.tfm \
texlive-cmextra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
