SUMMARY = "Reusable Invoke tasks"
DESCRIPTION = "Invocations is a collection of reusable `Invoke <http://pyinvoke.org>`_ \
tasks/task modules, including (but not limited to) Python project management \
tools such as documentation building and dependency organization. \
 \
It has no stand-alone components and is designed to be imported into your \
pre-existing Invoke task files. \
 \
Invocations is currently in pre-alpha status and is unsupported. Please follow \
the Invoke project's communication channels for updates. Thanks!"
LICENSE = "BSD-2-Clause"

PV = "4.0.2"

RPM_NAME = "python314-invocations-4.0.2-2.2.noarch.rpm"
RPM_HASH = "9dce23ceba1def83b0d4793513ea843841908f51f9c1846fa41cc6a8ac8b863e21d9bea6c81351aebbe77299cc81445d1334a6217892b281e3b811c1667c6752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-invocations \
python314-invocations \
python3dist-invocations"

RDEPENDS:${PN} += "python-abi \
python314-blessed \
python314-build \
python314-invoke \
python314-pip \
python314-releases \
python314-semantic-version \
python314-tabulate \
python314-tqdm \
python314-twine \
python314-wheel"

inherit rpm
