SUMMARY = "System user for the geoclue service"
DESCRIPTION = "System user for use by the geoclue service"
LICENSE = "GPL-2.0-or-later"

PV = "2.8.2"

RPM_NAME = "system-user-srvGeoClue-2.8.2-1.2.noarch.rpm"
RPM_HASH = "26322031b061cb6a8ef13ea902abc9a630e4475cd35431bb4ed3a0ee4da0fd9d60068c1fd5806e92023e7bdd4ac414b9b086774e0839a3ef051fc7b71702feba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-srvGeoClue \
system-user-srvGeoClue \
user-srvGeoClue"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
