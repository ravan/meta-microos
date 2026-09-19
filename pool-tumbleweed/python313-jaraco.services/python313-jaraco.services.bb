SUMMARY = "Service orchestration and pytest plugins"
DESCRIPTION = "Service orchestration and pytest plugins"
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python313-jaraco.services-4.0.0-1.4.noarch.rpm"
RPM_HASH = "d3add21683b6e73895473c6671525a3ace4f85b2ecd9a8c2e3caf69b7c326dde5cde3dec6697f624f3937ff198cbe09af647087a73cae80b26ec6b7215aa2289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.services \
python3.13dist-jaraco.services \
python313-jaraco.services \
python3dist-jaraco.services"

RDEPENDS:${PN} += "python-abi \
python313-jaraco.classes \
python313-path \
python313-portend \
python313-tempora"

inherit rpm
