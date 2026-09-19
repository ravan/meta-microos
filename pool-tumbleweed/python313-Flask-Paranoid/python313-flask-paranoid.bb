SUMMARY = "Flask user session protection"
DESCRIPTION = "Flask-Paranoid is an extension for the Flask framework that protects the \
application against certain attacks in which the user session cookie is stolen \
and then used by the attacker. \
 \
The extension generates a 'paranoid' token according to the IP address and user \
agent when a client connects to the flask application."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-Flask-Paranoid-0.3.0-4.5.noarch.rpm"
RPM_HASH = "783e1c6c2d242d501125c5770baa6d5e9ec1a8a25fc0f94c3da164e0d4cc285c15f16ba11677a8832789af93e34362cb4045b3b74be20404726ceb21b3b55321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Paranoid \
python3.13dist-flask-paranoid \
python313-Flask-Paranoid \
python3dist-flask-paranoid"

RDEPENDS:${PN} += "python-abi \
python313-Flask"

inherit rpm
