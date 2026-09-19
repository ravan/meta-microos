SUMMARY = "Transactional update executor configuration"
DESCRIPTION = "For transactional systems, like MicroOS, Salt can operate \
transparently if the executor 'transactional-update' is registered in \
list of active executors.  This package add the configuration file."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-transactional-update-3006.0-70.1.aarch64.rpm"
RPM_HASH = "1e4375558a8c0df81b85623022960e39121db76b17defd4db423cba6479486b55a327c0396f66e0bf84cc4137ba1059de96c4525848a62d2a950d5fd2ace4499"

RPROVIDES:${PN} += "config-salt-transactional-update \
salt-transactional-update"

RDEPENDS:${PN} += "salt \
salt-minion \
tar"

inherit rpm
