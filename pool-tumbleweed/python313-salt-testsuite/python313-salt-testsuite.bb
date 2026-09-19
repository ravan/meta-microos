SUMMARY = "Unit and integration tests for Salt"
DESCRIPTION = " \
Collection of unit, functional, and integration tests for salt-test."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "python313-salt-testsuite-3006.0-70.1.aarch64.rpm"
RPM_HASH = "bd5034f8dba45836ea2eeffecb743e39f7919ad9f405a498e578f1bd9db0b9e91304b727cc34f5cfdb0a63e3c8fa6ba2835b1dbb5803a60ac556576fb667c128"

RPROVIDES:${PN} += "python3-salt-testsuite \
python313-salt-testsuite"

RDEPENDS:${PN} += "/usr/bin/env \
docker \
git \
openssh \
python-abi \
python313-CherryPy \
python313-Genshi \
python313-Mako \
python313-boto3 \
python313-docker \
python313-pip \
python313-pygit2 \
python313-pytest \
python313-pytest-httpserver \
python313-pytest-salt-factories \
python313-pytest-subtests \
python313-testinfra \
python313-yamllint \
salt"

inherit rpm
