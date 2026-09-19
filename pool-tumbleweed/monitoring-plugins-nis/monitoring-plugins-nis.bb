SUMMARY = "Check the status of a NIS server on a specified host and NIS domain"
DESCRIPTION = "Check the status of a NIS server on a specified host and NIS domain by asking \
NIS server for 'passwd.byname'. \
 \
As an additional check, a username may be specified which will then be \
'looked up' on the NIS server, note that this is optional and only \
introduced in v1.1 \
 \
Script returns OK if it gets an acceptable answer, CRITICAL if not. \
 \
This *nix script has been designed and written for the lowest common \
denominator of shells (sh), uses yppoll, ypcat and grep as external \
commands."
LICENSE = "GPL-3.0+"

PV = "1.2"

RPM_NAME = "monitoring-plugins-nis-1.2-1.24.noarch.rpm"
RPM_HASH = "8fa397d678fb82d329a23fd20d291f125c191fa4922dcf26f67f9b0cfd3e18b616598008b5d84ac91d74870b0f94bb4afdab0b6a4ee7286f25736e16edae3bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-nis \
nagios-plugins-nis"

RDEPENDS:${PN} += "/usr/bin/sh \
yp-tools"

inherit rpm
