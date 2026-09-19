SUMMARY = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it"
DESCRIPTION = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python313-ephemeral-port-reserve-1.1.4-4.5.noarch.rpm"
RPM_HASH = "1d5b3001e7d2612d4dff0b62b24965ed5549410cbcdf8fb93803fe01b435091dc6820db2654877bd10b9b0cf7766117e92c513ffb9878ad69e72a8fb20989c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ephemeral-port-reserve \
python3.13dist-ephemeral-port-reserve \
python313-ephemeral-port-reserve \
python3dist-ephemeral-port-reserve"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
