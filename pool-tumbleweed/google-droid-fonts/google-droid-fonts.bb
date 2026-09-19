SUMMARY = "Fonts With Extensive Style and Language Support Developed for Android"
DESCRIPTION = "The Droid family of fonts consists of Droid Sans, Droid Sans Mono and \
Droid Serif. Each contains extensive character set coverage including \
Western Europe, Eastern/Central Europe, Baltic, Cyrillic, Greek and \
Turkish support. The Droid Sans regular font also includes support for \
Simplified and Traditional Chinese, Japanese and Korean support for the \
GB2312, Big 5, JIS 0208 and KSC 5601 character sets respectively. Droid \
was designed by Ascender's Steve Matteson to provide optimal quality \
and comfort on a mobile handset when rendered in application menus, web \
browsers and for other screen text. - Ascender Press Release, \
http://www.ascendercorp.com/pr/2007-11-12/"
LICENSE = "Apache-2.0"

PV = "20121204"

RPM_NAME = "google-droid-fonts-20121204-8.13.noarch.rpm"
RPM_HASH = "7dafd18826489ecde394ad82e55fa54b11b7f5917fd162d0585b6516161e1be247f41fbb48b7419631a9be8d2ee5b7f1dad1cef8b6b7e27e283165343d6ad778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "droid-fonts \
google-droid-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
