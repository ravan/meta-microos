SUMMARY = "An autocompletion tool for Python"
DESCRIPTION = "Jedi is a static analysis tool for Python that can be used in \
IDEs/editors. Its focus is autocompletion and static \
analysis. \
 \
Jedi has support for two different goto functions. It's possible to \
search for related names and to list all names in a Python file and \
infer them. Jedi understands docstrings and you can use Jedi \
autocompletion in your REPL as well. \
 \
Jedi uses an API to connect with IDEs. There is a reference \
implementation as a VIM plugin which uses Jedi's autocompletion."
LICENSE = "MIT & Python-2.0"

PV = "0.20.0"

RPM_NAME = "python314-jedi-0.20.0-1.2.noarch.rpm"
RPM_HASH = "bee7753f2cff4c45744b1380f5d694b9c6f3852b6288f8800ecf468af19ac7808724f8f4b08aa95009d4e705e502e121920a8a2238e1edd644e192370cf0fbbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jedi \
python314-jedi \
python3dist-jedi"

RDEPENDS:${PN} += "-python314-parso >= 0.8.6 with python314-parso < 0.9 \
python-abi"

inherit rpm
