SUMMARY = "Junos 'EZ' automation for non-programmers"
DESCRIPTION = "Junos PyEZ is designed to provide the same capabilities as a user would have \
on the Junos CLI, but in an environment built for automation tasks. \
These capabilities include, but are not limited to: \
 \
 - Remote connectivity and management of Junos devices via NETCONF \
 - Provide 'facts' about the device \
 - Retrieve 'operational' or 'run-state' information \
 - Retrieve configuration information \
 - Make configuration changes in unstructured and structured ways \
 - Provide common utilities for tasks such as secure copy of files and \
   software updates"
LICENSE = "Apache-2.0"

PV = "2.7.2"

RPM_NAME = "python314-junos-eznc-2.7.2-3.5.noarch.rpm"
RPM_HASH = "a5d5e4e6b395caaa2219b73d6a42550ac489f65d2b0507e9fe1935d0b41669fdd6475451a40cc75bd13640aff2ca1bac61e1ffd52c8adaa843ffa83e879714f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-junos-eznc \
python314-junos-eznc \
python3dist-junos-eznc"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-PyYAML \
python314-lxml \
python314-ncclient \
python314-netmiko \
python314-paramiko \
python314-pyparsing \
python314-pyserial \
python314-scp \
python314-transitions"

inherit rpm
