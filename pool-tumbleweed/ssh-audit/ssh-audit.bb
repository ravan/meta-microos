SUMMARY = "SSH server auditing"
DESCRIPTION = "ssh-audit is a tool for ssh server auditing. \
 \
Features: \
 * SSH1 and SSH2 protocol server support; \
 * grab banner, recognize device or software and operating system, detect compression; \
 * gather key-exchange, host-key, encryption and message authentication code algorithms; \
 * output algorithm information (available since, removed/disabled, unsafe/weak/legacy, etc); \
 * output algorithm recommendations (append or remove based on recognized software version); \
 * output security information (related issues, assigned CVE list, etc); \
 * analyze SSH version compatibility based on algorithm information; \
 * historical information from OpenSSH, Dropbear SSH and libssh;"
LICENSE = "MIT"

PV = "3.9.0"

RPM_NAME = "ssh-audit-3.9.0-1.1.noarch.rpm"
RPM_HASH = "a9dc5854513afdc9b9247b751dce786ccaad1b414ae1e1655e21100d2e550a00b76d4c334e93ba84fe431262755f56e02d6bb50874d6f3890100a80436f1cecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-ssh-audit \
python3dist-ssh-audit \
ssh-audit"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3"

inherit rpm
