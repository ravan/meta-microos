SUMMARY = "Python dependency injection framework, inspired by Guice"
DESCRIPTION = "Dependency injection as a formal pattern is less useful in Python than \
in other languages, primarily due to its support for keyword \
arguments, the ease with which objects can be mocked, and its dynamic \
nature. \
 \
That said, a framework for assisting in this process can remove a lot \
of boiler-plate from larger applications. That's where Injector can \
help. It automatically and transitively provides keyword arguments \
with their values. As an added benefit, Injector encourages nicely \
compartmentalised code through the use of Module s. \
 \
While being inspired by Guice, it does not slavishly replicate its \
API. Providing a Pythonic API trumps faithfulness."
LICENSE = "BSD-3-Clause"

PV = "0.24.0"

RPM_NAME = "python314-injector-0.24.0-1.3.noarch.rpm"
RPM_HASH = "52427bb8689e9d30fd449d86e45b32525f7b1cd1a7654898d185c81cd41d6b42eaa65a030f747d222d7b5a2f8d2f1d757f972b88c37aee6b59e26f36633dd32a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-injector \
python314-injector \
python3dist-injector"

RDEPENDS:${PN} += "python-abi \
python314"

inherit rpm
