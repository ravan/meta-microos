SUMMARY = "OpenStack oslo.reports library"
DESCRIPTION = "The project oslo.reports hosts a general purpose error report generation \
framework, known as the 'guru meditation report'."
LICENSE = "Apache-2.0"

PV = "3.9.0"

RPM_NAME = "python314-oslo.reports-3.9.0-1.1.noarch.rpm"
RPM_HASH = "b8c2107ea42b179e3e94f64c1808a983bc7e0449254768159e0c1d8ba2cee8c40cb0d00783a58bf1be22f8c945561b9161b5f847d00f45e6a00f28ed3bead321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.reports \
python314-oslo.reports \
python3dist-oslo.reports"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-oslo.config \
python314-oslo.i18n \
python314-oslo.serialization \
python314-oslo.utils \
python314-psutil"

inherit rpm
