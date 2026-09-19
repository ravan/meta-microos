SUMMARY = "Logos for openSUSE Slowroll"
DESCRIPTION = "Logos for openSUSE Slowroll"
LICENSE = "CC-BY-SA-4.0"

PV = "20250203"

RPM_NAME = "distribution-logos-openSUSE-Slowroll-20250203-2.2.noarch.rpm"
RPM_HASH = "4385360302522346da5229ccf04533310390da0f1071bc1073dabbfd9b2a045f7cfef859151fc998479e5cffe902639f32c76b21afe85c942c335c90a6fd87e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-logos \
distribution-logos-openSUSE-Slowroll"

RDEPENDS:${PN} += ""

inherit rpm
