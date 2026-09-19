SUMMARY = "KIWI - openSUSE Tumbleweed Minimal image templates"
DESCRIPTION = "This package contains system image templates to easily build \
a openSUSE Tumbleweed based operating system image with \
kiwi."
LICENSE = "MIT"

PV = "84.87.1"

RPM_NAME = "kiwi-templates-Minimal-84.87.1-43.1.noarch.rpm"
RPM_HASH = "55d819a0e96d70cc1f41e46f478570a44f69ecfd90ff66493b6712ec4aa641201f5992486410835e492b4ac57c2810b673321685aa977639b99e87f3fc1bccaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kiwi-templates-JeOS \
kiwi-templates-Minimal"

RDEPENDS:${PN} += "python3-kiwi"

inherit rpm
