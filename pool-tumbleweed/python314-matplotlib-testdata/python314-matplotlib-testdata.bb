SUMMARY = "Test data for python314-matplotlib"
DESCRIPTION = "This package includes the test baseline data \
for the python314-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python314-matplotlib-testdata-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "ed106bac091e7ff51653f363b77124ab061a51d587221b80ea272ca923c3a13efebc45e44b725d770c2aa18f92484c98acf2c8aba52989beb75e41fdec4af553"

RPROVIDES:${PN} += "python314-matplotlib-testdata"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib"

inherit rpm
