SUMMARY = "Flask user session protection"
DESCRIPTION = "Flask-Paranoid is an extension for the Flask framework that protects the \
application against certain attacks in which the user session cookie is stolen \
and then used by the attacker. \
 \
The extension generates a 'paranoid' token according to the IP address and user \
agent when a client connects to the flask application."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-Flask-Paranoid-0.3.0-4.5.noarch.rpm"
RPM_HASH = "60229cddaebdafd8d503001ccec104258b3f2a7e8ee70c0df42eab2126fd7e1d5d1737cf064f0f099e5611b92953e3fb1d91028f9ae476d9d3d31e5043081160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-paranoid \
python314-Flask-Paranoid \
python3dist-flask-paranoid"

RDEPENDS:${PN} += "python-abi \
python314-Flask"

inherit rpm
