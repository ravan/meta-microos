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

RPM_NAME = "python313-jedi-0.20.0-1.2.noarch.rpm"
RPM_HASH = "c5fa6c92eed6d832b91b94eeac5753c9ea308044a496768be79420701108e6e7e8521580453478e18cad203b01ebc07fe15583dcdf87fd608d86457a8ad31d6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jedi \
python3.13dist-jedi \
python313-jedi \
python3dist-jedi"

RDEPENDS:${PN} += "-python313-parso >= 0.8.6 with python313-parso < 0.9 \
python-abi"

inherit rpm
