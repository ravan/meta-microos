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

RPM_NAME = "python313-nagiosplugin-1.4.0-1.5.noarch.rpm"
RPM_HASH = "d3a4198a3d9ac2e53a6d9a1b3e979de420e98f946e6a40ebcd7d7e28577bb89f51d7355beed4d6a68786f8a67cbc6fc776236a1c81bf324e43d14075c751df70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nagiosplugin \
python3.13dist-nagiosplugin \
python313-nagiosplugin \
python3dist-nagiosplugin"

RDEPENDS:${PN} += "python-abi \
python313-setuptools"

inherit rpm
