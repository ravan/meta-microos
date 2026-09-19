SUMMARY = "System user and group 'loki'"
DESCRIPTION = "This package provides a shared system user for all Loki components"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-loki-1.0.0-1.16.noarch.rpm"
RPM_HASH = "e4d2fcb96ac1fd0903155140ae85087d9b0a5c36ef3f13d046f940e0035b68ff95df5b03b257a517f6322ac13e5e23a9bb5eefe522dc1d42d094ae8df6839cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-loki \
system-user-loki \
user-loki"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
