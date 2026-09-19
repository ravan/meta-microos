SUMMARY = "RPM macros for building Mozilla extensions under openSUSE"
DESCRIPTION = "XPI ID retrieval script and helpful RPM macros for packaging up \
addons for the Mozilla suite."
LICENSE = "SUSE-Public-Domain"

PV = "1"

RPM_NAME = "mozaddon-devel-1-2.14.noarch.rpm"
RPM_HASH = "b23fc4977da68e9164f84366813792104e9e00b3a22f48ab588bd755a3739413d2a5d63ca9126c5b64df82f22a5dd7dbc2d86d21066d4fa80598502f5ee31245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mozaddon-devel \
rpm-macro-mozilla-addon-install \
rpm-macro-mozilla-addondir \
rpm-macro-mozilla-firefox-appid \
rpm-macro-mozilla-moduledir \
rpm-macro-mozilla-mozillapath \
rpm-macro-mozilla-pluginsdir \
rpm-macro-mozilla-seamonkey-appid \
rpm-macro-mozilla-sunbird-appid \
rpm-macro-mozilla-thunderbird-appid \
rpm-macro-mozilla-unlock-addons"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Archive--Zip \
perl-XML--Simple \
unzip"

inherit rpm
