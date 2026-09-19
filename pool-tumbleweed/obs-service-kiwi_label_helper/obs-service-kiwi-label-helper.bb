SUMMARY = "Service to duplicate labels with a custom prefix"
DESCRIPTION = "This service can be used during buildtime to implement the \
suse_label_helper:add_prefix element useful for building containers."
LICENSE = "GPL-2.0-or-later"

PV = "0.0"

RPM_NAME = "obs-service-kiwi_label_helper-0.0-4.10.noarch.rpm"
RPM_HASH = "238c7afa655caadec8d874986dd2017763cf6f260ac0a0accc354ae23da4dd1bbc5a3810993fa07b8b801c57883ee1a653cdc601d4fc2f88151d3e96f914cc02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-kiwi-label-helper"

RDEPENDS:${PN} += "/usr/bin/bash \
libxslt-tools"

inherit rpm
