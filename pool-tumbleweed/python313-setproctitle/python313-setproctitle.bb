SUMMARY = "Python module to allow customization of the process title"
DESCRIPTION = "Changing the title is mostly useful in multi-process systems, for example when \
a master process is forked: changing the children's title allows to identify \
the task each process is busy with. The technique is used by PostgreSQL  and \
the OpenSSH Server for example."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "python313-setproctitle-1.3.7-2.1.aarch64.rpm"
RPM_HASH = "9b493a96b3e6cc895804c1923b0860266086eeb00ba38410b1c1646599765e8927d742f7538cc24a6a6784dbf9bfab15e95d4289c53904469b6a145568bedcc6"

RPROVIDES:${PN} += "python3-setproctitle \
python3.13dist-setproctitle \
python313-setproctitle \
python3dist-setproctitle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
