SUMMARY = "Template Text Parser Templates collections"
DESCRIPTION = "This repository contains a collection of [TTP](https://github.com/dmulyalin/ttp) templates."
LICENSE = "MIT"

PV = "0.3.7"

RPM_NAME = "python314-ttp-templates-0.3.7-2.5.noarch.rpm"
RPM_HASH = "1a710e941ba97b722169ab86d262413cd89839429afe796e4c2e68f8b4f326c7c8d1a55bc2143a05f6e4eb00d13943933a5fe5179d57a89024dc772eb03b8a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ttp-templates \
python314-ttp-templates \
python3dist-ttp-templates"

RDEPENDS:${PN} += "python-abi"

inherit rpm
