SUMMARY = "Font Awesome 6 with LaTeX support"
DESCRIPTION = "This package provides LaTeX support for the included 'Font \
Awesome 6 Free' icon set. These icons were designed by Fort \
Awesome and released under the SIL OFL 1.1 license. The \
commercial 'Pro' version is also supported, if it is installed \
and XeLaTeX or LuaLaTeX is used. For this font you need a paid \
license, for more information visit Fort Awesome Pro. More \
information about Font Awesome is available at Fort Awesome. To \
use an icon after the package is loaded, just enter the name of \
the icon in CamelCase prefixed with \\fa, for example \
\\faAddressBook for the address-book icon. The TeX files are \
derived from the Font Awesome 5package, are maintained by \
Daniel Nagel and are released under the LaTeX Project Public \
License version 1.3c. All included fonts are provided by Fort \
Awesome under the SIL OFL 1.1 license This package is not an \
official Fort Awesome project. For bug reports, please open an \
issue at https://github.com/braniii/fontawesome."
LICENSE = "OFL-1.1"

PV = "2026.226.6.7.2_3svn77682"

RPM_NAME = "texlive-fontawesome6-2026.226.6.7.2_3svn77682-60.2.noarch.rpm"
RPM_HASH = "7870362af06b5d2853362a20acfb173848b2b6b9189b6c7729912697a58f93e13e590de1b87aabf8ad47f3044b44079ff13290dec96969f7fab64be66345f588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fa6brands0.enc \
tex-fa6brands0.tfm \
tex-fa6brands1.enc \
tex-fa6brands1.tfm \
tex-fa6brands2.enc \
tex-fa6brands2.tfm \
tex-fa6free0.enc \
tex-fa6free0regular.tfm \
tex-fa6free0solid.tfm \
tex-fa6free1.enc \
tex-fa6free1regular.tfm \
tex-fa6free1solid.tfm \
tex-fa6free2.enc \
tex-fa6free2regular.tfm \
tex-fa6free2solid.tfm \
tex-fa6free3.enc \
tex-fa6free3regular.tfm \
tex-fa6free3solid.tfm \
tex-fa6free4.enc \
tex-fa6free4regular.tfm \
tex-fa6free4solid.tfm \
tex-fa6free5.enc \
tex-fa6free5regular.tfm \
tex-fa6free5solid.tfm \
tex-fontawesome6-generic-helper.sty \
tex-fontawesome6-mapping.def \
tex-fontawesome6-utex-helper.sty \
tex-fontawesome6.map \
tex-fontawesome6.sty \
tex-tufontawesome6brands.fd \
tex-tufontawesome6free.fd \
tex-tufontawesome6pro.fd \
tex-ufontawesome6brands0.fd \
tex-ufontawesome6brands1.fd \
tex-ufontawesome6brands2.fd \
tex-ufontawesome6free0.fd \
tex-ufontawesome6free1.fd \
tex-ufontawesome6free2.fd \
tex-ufontawesome6free3.fd \
tex-ufontawesome6free4.fd \
tex-ufontawesome6free5.fd \
texlive-fontawesome6"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-luatexbase.sty \
tex-updmap.cfg \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-fontawesome6-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
