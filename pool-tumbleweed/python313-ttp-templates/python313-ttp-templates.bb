SUMMARY = "Template Text Parser Templates collections"
DESCRIPTION = "This repository contains a collection of [TTP](https://github.com/dmulyalin/ttp) templates."
LICENSE = "MIT"

PV = "0.3.7"

RPM_NAME = "python313-ttp-templates-0.3.7-2.5.noarch.rpm"
RPM_HASH = "9e1ab4188f17184d087992949e8cb6c23ea13d2d8a7c9cefde9709e91054b7172d767a8653273d07aedaec7ebcad626bf0877f64fa1d2738e566a4546e5405ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ttp-templates \
python3.13dist-ttp-templates \
python313-ttp-templates \
python3dist-ttp-templates"

RDEPENDS:${PN} += "python-abi"

inherit rpm
