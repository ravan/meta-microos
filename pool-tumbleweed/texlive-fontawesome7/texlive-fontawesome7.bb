SUMMARY = "Font Awesome 7 with LaTeX support"
DESCRIPTION = "This package provides LaTeX support for the included 'Font \
Awesome 7 Free' icon set. These icons were designed by Fort \
Awesome and released under the SIL OFL 1.1 license. The \
commercial 'Pro' version has only preliminary alpha support for \
now, if it is installed and XeLaTeX or LuaLaTeX is used. For \
this font you need a paid license, for more information visit \
Fort Awesome Pro. More information about Font Awesome is \
available at Fort Awesome. To use an icon after the package is \
loaded, just enter the name of the icon in CamelCase prefixed \
with \\fa, for example \\faAddressBook for the address-book icon. \
The TeX files are derived from the Font Awesome 5package, are \
maintained by Daniel Nagel and are released under the LaTeX \
Project Public License version 1.3c. All included fonts are \
provided by Fort Awesome under the SIL OFL 1.1 license This \
package is not an official Fort Awesome project. For bug \
reports, please open an issue at \
https://github.com/braniii/fontawesome."
LICENSE = "OFL-1.1"

PV = "2026.226.7.1.0_1svn76735"

RPM_NAME = "texlive-fontawesome7-2026.226.7.1.0_1svn76735-60.2.noarch.rpm"
RPM_HASH = "ab73af099b1e7af8bd7f70425ae64c0627e9219c3533441bbfc77d4dc1d70002daa3d9c1aff27205b6a40e4673b4ddbc2469644c9e71aea067d4328e5098d7fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fa7brands0.enc \
tex-fa7brands0.tfm \
tex-fa7brands1.enc \
tex-fa7brands1.tfm \
tex-fa7brands2.enc \
tex-fa7brands2.tfm \
tex-fa7free0-regular.enc \
tex-fa7free0-solid.enc \
tex-fa7free0regular.tfm \
tex-fa7free0solid.tfm \
tex-fa7free1-regular.enc \
tex-fa7free1-solid.enc \
tex-fa7free1regular.tfm \
tex-fa7free1solid.tfm \
tex-fa7free2-regular.enc \
tex-fa7free2-solid.enc \
tex-fa7free2regular.tfm \
tex-fa7free2solid.tfm \
tex-fa7free3-regular.enc \
tex-fa7free3-solid.enc \
tex-fa7free3regular.tfm \
tex-fa7free3solid.tfm \
tex-fa7free4-regular.enc \
tex-fa7free4-solid.enc \
tex-fa7free4regular.tfm \
tex-fa7free4solid.tfm \
tex-fa7free5-regular.enc \
tex-fa7free5-solid.enc \
tex-fa7free5regular.tfm \
tex-fa7free5solid.tfm \
tex-fontawesome7-generic-helper.sty \
tex-fontawesome7-mapping.def \
tex-fontawesome7-utex-helper.sty \
tex-fontawesome7.map \
tex-fontawesome7.sty \
tex-tufontawesome7brands.fd \
tex-tufontawesome7free.fd \
tex-tufontawesome7pro.fd \
tex-ufontawesome7brands0.fd \
tex-ufontawesome7brands1.fd \
tex-ufontawesome7brands2.fd \
tex-ufontawesome7free0.fd \
tex-ufontawesome7free1.fd \
tex-ufontawesome7free2.fd \
tex-ufontawesome7free3.fd \
tex-ufontawesome7free4.fd \
tex-ufontawesome7free5.fd \
texlive-fontawesome7"

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
texlive-fontawesome7-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
