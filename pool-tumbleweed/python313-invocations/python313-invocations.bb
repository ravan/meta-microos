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

RPM_NAME = "python313-invocations-4.0.2-2.2.noarch.rpm"
RPM_HASH = "c43ab08f7e4dfa8ea6428e2357c70757a80ad81c3da8b905db8f141cc4864ebe5d35e6fb57934ae67ccfe2f56fabcb1cb0dae3a45dd78042565ca35f733a09af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-invocations \
python3.13dist-invocations \
python313-invocations \
python3dist-invocations"

RDEPENDS:${PN} += "python-abi \
python313-blessed \
python313-build \
python313-invoke \
python313-pip \
python313-releases \
python313-semantic-version \
python313-tabulate \
python313-tqdm \
python313-twine \
python313-wheel"

inherit rpm
