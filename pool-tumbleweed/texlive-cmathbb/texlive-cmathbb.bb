SUMMARY = "Computer modern mathematical blackboard bold font"
DESCRIPTION = "This font contains all digits and latin letters uppercase and \
lowercase for the Computer Modern font family in blackboard \
bold."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn56414"

RPM_NAME = "texlive-cmathbb-2026.226.1.0svn56414-60.2.noarch.rpm"
RPM_HASH = "1aecc3e6c622856b93276e32462191bca4fdb804765271968a0fb7c7389c924ca50280454fd5378d0c3f5f972dd1247b319c3e847494a2fc0214029acdb24875"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a-ghauqe.enc \
tex-a-jggq4p.enc \
tex-a-ns6ls2.enc \
tex-a-szuv3s.enc \
tex-cmathbb-Regular-tlf-ly1--base.tfm \
tex-cmathbb-Regular-tlf-ly1--lcdfj.tfm \
tex-cmathbb-Regular-tlf-ly1.tfm \
tex-cmathbb-Regular-tlf-ly1.vf \
tex-cmathbb-Regular-tlf-ot1--base.tfm \
tex-cmathbb-Regular-tlf-ot1--lcdfj.tfm \
tex-cmathbb-Regular-tlf-ot1.tfm \
tex-cmathbb-Regular-tlf-ot1.vf \
tex-cmathbb-Regular-tlf-t1--base.tfm \
tex-cmathbb-Regular-tlf-t1--lcdfj.tfm \
tex-cmathbb-Regular-tlf-t1.tfm \
tex-cmathbb-Regular-tlf-t1.vf \
tex-cmathbb-Regular-tlf-ts1--base.tfm \
tex-cmathbb-Regular-tlf-ts1.tfm \
tex-cmathbb-Regular-tlf-ts1.vf \
tex-cmathbb.map \
tex-cmathbb.sty \
tex-ucmath.fd \
texlive-cmathbb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-updmap.cfg \
texlive \
texlive-cmathbb-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
