SUMMARY = "Devel package for Firefox"
DESCRIPTION = "Development files for Firefox to make packaging of addons easier."
LICENSE = "MPL-2.0"

PV = "154.0"

RPM_NAME = "MozillaFirefox-devel-154.0-1.2.noarch.rpm"
RPM_HASH = "adce2880e6bee1ae6a89a1fedb8d490a75367c2af54b686b10446d4f9dde359af3f918c3ac52eae1025c1dc11626ee185fcc23f5d2fd06ff9aedfdc1cd735baf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "MozillaFirefox-devel \
firefox-devel \
rpm-macro-firefox-appid \
rpm-macro-firefox-ext-install \
rpm-macro-firefox-extdir \
rpm-macro-firefox-mainver \
rpm-macro-firefox-major \
rpm-macro-firefox-mozillapath \
rpm-macro-firefox-pluginsdir \
rpm-macro-firefox-version"

RDEPENDS:${PN} += "/usr/bin/perl \
MozillaFirefox \
perl-Archive--Zip \
perl-XML--Simple"

inherit rpm
