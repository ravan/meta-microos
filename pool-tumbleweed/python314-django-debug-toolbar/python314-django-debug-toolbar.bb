SUMMARY = "A configurable set of panels that display various debug information"
DESCRIPTION = "The Django Debug Toolbar is a configurable set of panels that display various \
debug information about the current request/response and when clicked, display \
more details about the panel's content. \
 \
Currently, the following panels have been written and are working: \
 - Django version \
 - Request timer \
 - A list of settings in settings.py \
 - Common HTTP headers \
 - GET/POST/cookie/session variable display \
 - Templates and context used, and their template paths \
 - SQL queries including time to execute and links to EXPLAIN each query \
 - List of signals, their args and receivers \
 - Logging output via Python's built-in logging, or via the logbook module \
 \
There is also one Django management command currently: \
 - debugsqlshell: Outputs the SQL that gets executed as you work in the Python \
   interactive shell."
LICENSE = "BSD-3-Clause"

PV = "7.1.1"

RPM_NAME = "python314-django-debug-toolbar-7.1.1-1.1.noarch.rpm"
RPM_HASH = "b5f2e75d93db6ddc0d9e47424143befab4e9f277bb593d0153d6e13a3991541b36bacb9cb6eec68c0d704f1182fd19d7085fb2e938f9d8b26b6c0d80bccc168a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-debug-toolbar \
python314-django-debug-toolbar \
python3dist-django-debug-toolbar"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-sqlparse"

inherit rpm
