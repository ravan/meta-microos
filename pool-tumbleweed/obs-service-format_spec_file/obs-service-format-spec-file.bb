SUMMARY = "An OBS source service: reformats a spec file to SUSE standard"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
This source service is formating the spec file to SUSE standard. The rational \
behind is to make it easier to review spec files from unknown packagers. \
 \
This should be used in 'trylocal' mode, so that osc is adapting the existing \
spec file instead of creating a new one."
LICENSE = "GPL-2.0-only"

PV = "20260320"

RPM_NAME = "obs-service-format_spec_file-20260320-2.2.noarch.rpm"
RPM_HASH = "3fc07f6d7a5a024cf85947e0937d684ba81565530e15b57d04b4833e9ed62c4ded5e14e997a5573284cb6dd8496e64a5be66434ee15e825ab782019e9fdec503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-format-spec-file"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
obs-service-source-validator"

inherit rpm
