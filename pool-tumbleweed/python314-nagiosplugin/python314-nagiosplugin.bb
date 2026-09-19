SUMMARY = "Class library for writing Nagios (Icinga) plugins"
DESCRIPTION = "nagiosplugin is a Python class library which helps writing Nagios (or Icinga) \
compatible plugins in Python. It cares for much of the boilerplate code \
and default logic commonly found in Nagios checks, including: \
 \
- Nagios 3 Plugin API compliant parameters and output formatting \
- Full Nagios range syntax support \
- Automatic threshold checking \
- Multiple independent measures \
- Custom status line to communicate the main point quickly \
- Long output and performance data \
- Timeout handling \
- Persistent 'cookies' to retain state information between check runs \
- Resumption of log file processing at the point where the last run left off \
- No dependencies beyond the Python standard library"
LICENSE = "ZPL-2.1"

PV = "1.4.0"

RPM_NAME = "python314-nagiosplugin-1.4.0-1.5.noarch.rpm"
RPM_HASH = "d1d8c99ce7946ad817306c91ede5e4781a7ade181ed5c47b304580431e6fbfc55fd7a43b30384b852ff18d92d41b445c95cd5f0f2c5e56be46272ee083b52f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nagiosplugin \
python314-nagiosplugin \
python3dist-nagiosplugin"

RDEPENDS:${PN} += "python-abi \
python314-setuptools"

inherit rpm
