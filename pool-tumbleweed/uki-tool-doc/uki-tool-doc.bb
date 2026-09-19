SUMMARY = "Documentation for the package uki-tool"
DESCRIPTION = "This package contains the documentation for the uki-tool."
LICENSE = "MIT"

PV = "1.5.0+1.g563332e"

RPM_NAME = "uki-tool-doc-1.5.0+1.g563332e-1.4.noarch.rpm"
RPM_HASH = "9c7b43ed92f817333a4232399ea852b111db8e96d4b76041083e2f4babdce43f2806199b480cc611a69de84c5ca87872dc35f96be513f572a1ac04e43f8c7fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uki-tool-doc"

RDEPENDS:${PN} += "uki-tool"

inherit rpm
