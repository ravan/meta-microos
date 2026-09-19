SUMMARY = "Secure Firefox profile for anonymous web browsing"
DESCRIPTION = "JonDoFox is a profile for the Mozilla Firefox web browser or \
Firefox ESR (recommended), particularly optimized for anonymous \
and secure web surfing. For anonymous surfing you need an \
IP changer proxy too. We recommend our proxy tool JonDo. \
 \
By default JonDoFox uses restrictive settings for security reasons. \
Time by time a website does not work like expected. You may have \
a look at our online help for JonDoFox to learn how to deal with \
restrictions. \
 \
This package contains an secure browser profil for anonymous web browsing. \
 \
 \
Adjust when needed than user JonDoFox and rename profile to use JonDoFox name \
 \
mv ~/.mozilla/firefox/profile ~/.mozilla/firefox/JonDoFox \
 \
sed -i 's|Path=profile|Path=JonDoFox|' ~/.mozilla/firefox/profiles.ini"
LICENSE = "GPL-3.0+"

PV = "2.15.0"

RPM_NAME = "jondofox-2.15.0-1.29.noarch.rpm"
RPM_HASH = "eb259e3ba03fd73bbdccbf4837982b8e77f962b4dce6ccba21d9bab27104f370735d6d147d84f8d7cb959fabafc88b5aca42d8474f7606db59d0a0cc57d75a1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jondofox"

RDEPENDS:${PN} += "/usr/bin/bash \
firefox"

inherit rpm
