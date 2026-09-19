SUMMARY = "Python library for parsing Java properties"
DESCRIPTION = "A python library for parsing Java properties files."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python313-pyjavaproperties-0.7-3.5.noarch.rpm"
RPM_HASH = "3e7c855ad5112ab22624545e515961b31ab4e41604205c6045f2b87258ea82123995dd7a8ea64cf8a931b0d2b7301be626ade6c847095d56cce60bd89dea5ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyjavaproperties \
python3.13dist-pyjavaproperties \
python313-pyjavaproperties \
python3dist-pyjavaproperties"

RDEPENDS:${PN} += "python-abi \
python313-base"

inherit rpm
