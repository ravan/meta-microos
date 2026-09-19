SUMMARY = "Marmelad Cyrillic Font"
DESCRIPTION = "Marmelad is designed specifically for medium to large-size headlines and \
remains well-balanced for long text setting because of its regular \
proportions and medium contrast. Ascenders and descenders are elegant \
and details refined. The name and overall feel refers to marmalade \
sweets – soft and ductile. \
 \
All vertical strokes are rounded towards the baseline, which is why \
technically there is no sense for overshoots in rounded letters like O. \
Marmelad performs well on screen because of its soft rounded features \
and generous x-height. \
 \
The font supports Latin-1, Cyrillic and Turkish (Latin-5) encoding."
LICENSE = "OFL-1.1"

PV = "1.000"

RPM_NAME = "cyreal-marmelad-fonts-1.000-7.25.noarch.rpm"
RPM_HASH = "3762e6d56300293926cc0a84f26dae88d03fb19429269816078b7e4ef4d53dff29263f676d9f90ce9b93c14c9d187871f25a04d72c07e9b2db390e7920e4a064"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-marmelad-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
