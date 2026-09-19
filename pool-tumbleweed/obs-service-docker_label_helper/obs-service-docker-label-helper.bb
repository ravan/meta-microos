SUMMARY = "OBS Service to add prefixed labels in Dockerfile builds"
DESCRIPTION = "An OBS service which expands LABEL instructions in Dockerfile with prefixes. \
Useful for implementing https://en.opensuse.org/Building_derived_containers#Labels."
LICENSE = "GPL-2.0-or-later"

PV = "0.0"

RPM_NAME = "obs-service-docker_label_helper-0.0-7.7.noarch.rpm"
RPM_HASH = "407de855981988820248b36ed2f5f457719b9348863a8f2b7733db026bb774489ef37702e276c938d68036e00af86ce63d50ec562a09ee6398138311c0ba6751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-docker-label-helper"

RDEPENDS:${PN} += "/usr/bin/bash \
gawk"

inherit rpm
