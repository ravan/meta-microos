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

RPM_NAME = "python313-junos-eznc-2.7.2-3.5.noarch.rpm"
RPM_HASH = "fbc207288e16d5972b7b7c91509bc879b12ffe5ffac3f92ddf1d8256334e48835e901baf1a620bc6fe529212dd7fdc6b817317c4cba1ef6bccd046bdcb464bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-junos-eznc \
python3.13dist-junos-eznc \
python313-junos-eznc \
python3dist-junos-eznc"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-PyYAML \
python313-lxml \
python313-ncclient \
python313-netmiko \
python313-paramiko \
python313-pyparsing \
python313-pyserial \
python313-scp \
python313-transitions"

inherit rpm
