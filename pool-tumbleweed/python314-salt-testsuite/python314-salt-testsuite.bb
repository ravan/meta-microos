SUMMARY = "Unit and integration tests for Salt"
DESCRIPTION = " \
Collection of unit, functional, and integration tests for salt-test."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "python314-salt-testsuite-3006.0-70.1.aarch64.rpm"
RPM_HASH = "cd20cebd4d40b0febbdecad9efdd4c09fe1db43ca1a1441997ac324b74df0a407641cdc03c85430a9c042514a2ce2e2207301cca9cd9acef9607a020448bd5b5"

RPROVIDES:${PN} += "python314-salt-testsuite"

RDEPENDS:${PN} += "/usr/bin/env \
docker \
git \
openssh \
python-abi \
python314-CherryPy \
python314-Genshi \
python314-Mako \
python314-boto3 \
python314-docker \
python314-pip \
python314-pygit2 \
python314-pytest \
python314-pytest-httpserver \
python314-pytest-salt-factories \
python314-pytest-subtests \
python314-testinfra \
python314-yamllint \
salt"

inherit rpm
