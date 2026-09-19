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

RPM_NAME = "python313-django-debug-toolbar-7.1.1-1.1.noarch.rpm"
RPM_HASH = "6ad549988e3a8f32f013598c764c54b7f0ceec82b7c6d0d52bc2e171c5f7bf9cddc75feff125e04c6559e03b72902222f62a39f33ba03b81e65991932ad4ba9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-debug-toolbar \
python3.13dist-django-debug-toolbar \
python313-django-debug-toolbar \
python3dist-django-debug-toolbar"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-sqlparse"

inherit rpm
